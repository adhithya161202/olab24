package newshelf;

public sealed interface IBook permits Ncomic, Nfiction, NtextBook ,NfictionType{

}
