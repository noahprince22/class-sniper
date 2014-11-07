package shared;

public enum Department {
	
	AAS("AAS"),
	ABE("ABE"),
	ACCY("ACCY"),
	ACE("ACE"),
	ACES("ACES"),
	ADV("ADV"),
	AE("AE"),
	AFAS("AFAS"),
	AFRO("AFRO"),
	AFST("AFST"),
	AGCM("AGCM"),
	AGED("AGED"),
	AHS("AHS"),
	AIS("ATS"),
	ANSC("ANSC"),
	ANTH("ANTH"),
	ARAB("ARAB"),
	ARCH("ARCH"),
	ART("ART"),
	ARTD("ARTD"),
	ARTE("ARTE"),
	ARTF("ARTF"),
	ARTH("ARTH"),
	ASST("ASST"),
	ASTR("ASTR"),
	ATMS("ATMS"),
	AVI("AVI"),
	BADM("BADM"),
	BASQ("BASQ");
	// TODO add the rest of the departments
	
	private final String name;
	
	private Department(final String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
