package long_parameter_list;

public class WalletNotification {
	private EmailService emailService;

	public WalletNotification(EmailService emailService) {
		super();
		this.emailService = emailService;
	}
	
	public void balanceNotif(User user, int amount) {
		if(amount == 0) {
			throw new IllegalArgumentException("tidak ada perubahan saldo");
		}
		
		String body = "";
		
		if (amount > 0) { 
			user.getWallet().add(amount);
			body = String.format(
				"Halo %s, ada %.2f masuk ke akunmu nih. " + 
				"Sekarang balance-mu menjadi %.2f", user.getName(), amount, user.getWallet().getBalance());
		} if(amount < 0) {
			user.getWallet().reduce(-amount);
			body = String.format(
					"Halo %s, ada %.2f keluar dari akunmu nih. " + 
					"Sekarang balance-mu menjadi %.2f", user.getName(), amount, user.getWallet().getBalance());
		}
		
		this.emailService.send(user.getEmail(), "example@company.com", body);
	}
}
