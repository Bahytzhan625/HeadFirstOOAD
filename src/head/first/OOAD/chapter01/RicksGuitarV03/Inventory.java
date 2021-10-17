//package head.first.OOAD.chapter01.RicksGuitarV03;
//
//import head.first.OOAD.chapter01.RicksGuitarV03.Builder;
//import head.first.OOAD.chapter01.RicksGuitarV03.Guitar;
//import head.first.OOAD.chapter01.RicksGuitarV03.Type;
//import head.first.OOAD.chapter01.RicksGuitarV03.Wood;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Inventory {
//	private List guitars;
//
//	public Inventory() {
//		guitars = new LinkedList();
//	}
//
//	public void addGuitar(String serialNumber, double price,
//						  Builder builder, String model,
//						  Type type, Wood backWood, Wood topWood) {
//		Guitar guitar = new Guitar(serialNumber, price, builder,
//				model, type, backWood, topWood);
//		guitars.add(guitar);
//	}
//
//	public Guitar getGuitar(String serialNumber) {
//		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
//			Guitar guitar = (Guitar)i.next();
//			if (guitar.getSerialNumber().equals(serialNumber)) {
//				return guitar;
//			}
//		}
//		return null;
//	}
//
//	public List search(GuitarSpec searchSpec) {
//		List matchingGuitar = new LinkedList();
//		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
//			Guitar guitar = (Guitar)i.next();
//			GuitarSpec guitarSpec = guitar.getSpec();
//			if (searchSpec.getBuilder() != guitarSpec.getBuilder())
//				continue;
//			String model = searchSpec.getModel().toLowerCase();
//			if ((model != null) && (!model.equals("")) &&
//					(!model.equals(guitarSpec.getModel().toLowerCase())))
//				continue;
//			if (searchSpec.getType() != guitarSpec.getType())
//				continue;
//			if (searchSpec.getBackWood() != guitarSpec.getBackWood())
//				continue;
//			if (searchSpec.getTopWood() != guitarSpec.getTopWood())
//				continue;
//			// matchingGuitars.add(guitar);
//		}
//		// return matchingGuitars;
//	 }
//}
