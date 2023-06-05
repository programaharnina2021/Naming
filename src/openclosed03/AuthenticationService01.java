package openclosed03;

public final class AuthenticationService01 {
	
	//Para explicar el problema add el de apple
	public void siging(AuthenticationEngine00 userEngine) {
		switch (userEngine) {
		case facebook:
			signingFacebook();
			break;
		case google:
			signingGoogle();
			break;
		case twitter:
			signingTwitter();
			break;
		}
	}

	public void signingFacebook() {

	}

	public void signingGoogle() {

	}

	public void signingTwitter() {

	}
}
