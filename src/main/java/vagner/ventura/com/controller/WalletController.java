package vagner.ventura.com.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import vagner.ventura.com.dto.CreateWalletDto;
import vagner.ventura.com.picpay.entities.Wallet;
import vagner.ventura.com.services.WalletService;

@RestController
public class WalletController {

	private WalletService walletService;

	public WalletController(WalletService walletService) {
		this.walletService = walletService;
	}
	
	@PostMapping("/wallets")
	public ResponseEntity<Wallet> createWallet(@RequestBody CreateWalletDto createWalletDto) {
		
		var createdWallet = walletService.createWallet(createWalletDto);
		
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdWallet.getId())
                .toUri();
		
		return ResponseEntity.created(location).body(createdWallet);
	}
	
	
}
