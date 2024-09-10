package vagner.ventura.com.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vagner.ventura.com.picpay.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long>{

}
