package Houses.HouseBuilder;

import Houses.House;

public interface SpecialRoofHouseBuilder extends HouseBuilder {
    House constructRoof(String roofType);
}
