package Builder.Builderpattern;

public class com {
	private String HDD;
	private String RAM;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private com(comBuilder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	//Builder Class
		public static class comBuilder{

			// required parameters
			private String HDD;
			private String RAM;

			// optional parameters
			private boolean isGraphicsCardEnabled;
			private boolean isBluetoothEnabled;
			
			public comBuilder(String hdd, String ram){
				this.HDD=hdd;
				this.RAM=ram;
			}

			public comBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled = isGraphicsCardEnabled;
				return this;
			}

			public comBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
			}
			
			public com build(){
				return new com(this);
			}

		}

}
