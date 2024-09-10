package vagner.ventura.com.services;

import org.springframework.stereotype.Service;

import vagner.ventura.com.dto.CreateWalletDto;
import vagner.ventura.com.picpay.entities.Wallet;
import vagner.ventura.com.picpay.repositories.WalletRepository;

@Service
public class WalletService {

	private WalletRepository walletRepository;
	
	public WalletService(WalletRepository walletRepository) {
		this.walletRepository = walletRepository;
	}

	public Wallet  createWallet(CreateWalletDto createWalletDto) {
		var entity = createWalletDto.toWallet(); 
		
	 return walletRepository.save(entity);
		
	}

}
