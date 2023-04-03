
public class Invoice implements Payable {
 
   private int partNumber;
   private String partDescription;
   private double quantity;
   private double pricePerItem;
   public Invoice(int partNumber, String partDescription, double quantity,double pricePerItem) {
	   this.partNumber=partNumber;
       this.partDescription=partDescription;
	   if(quantity>=0) {
       this.quantity=quantity;
	   }
	   else {
		   System.out.println("Warning");
	   }
	   if(pricePerItem>0) {
		   this.pricePerItem=pricePerItem;
		   }
	   else {
		   System.out.println("Warning");
	   }
		   
	   
   }
   public double getPaymentAmount() {
	   return getQuantity()* getPricePerItem();
   }

   private double getPricePerItem() {
		return pricePerItem;
	}
	private void setPricePerItem(double pricePerItem) {
		 if(pricePerItem>0) {
			   this.pricePerItem=pricePerItem;
			   }
		   else {
			   System.out.println("Warning");
		   }
	}
	private double getPartNumber() {
		return partNumber;
	}

	private void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	private String getPartDescription() {
		return partDescription;
	}

	private void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	private double getQuantity() {
		return quantity;
	}

	private void setQuantity(double quantity) {
		 if(quantity>=0) {
		       this.quantity=quantity;
			   }
			   else {
				   System.out.println("Warning");
			   }
	}

    public String toString() {
    	return "invoice:"+"\n"+
    			"part number: "+getPartNumber()+""+getPartDescription()+"\n"+
                "quantity: "+getQuantity()+"\n"+
    			"price per item: "+getPricePerItem();
                
    	                         
                
    	
    }
}
