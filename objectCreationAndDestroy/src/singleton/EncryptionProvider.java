package singleton;

//Best way to implement singleton
//protection against serialization comes naturally
//Looks bit un natural


public enum EncryptionProvider {
    INSTANCE;

    public void encrypt() {

    }
}
