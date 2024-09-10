package vagner.ventura.com.dto;

import java.math.BigDecimal;

import vagner.ventura.com.picpay.entities.Wallet;
import vagner.ventura.com.picpay.entities.WalletType;

public record CreateWalletDto (String fullName, String cpfCnpj, String email, String password, BigDecimal balance,
		WalletType.Enum walletType) {

	public Wallet toWallet() {
		return new Wallet(fullName, cpfCnpj, email, password, balance, walletType.get());
	}

}
