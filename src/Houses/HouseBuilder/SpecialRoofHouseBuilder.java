package Houses.HouseBuilder;

import Houses.House;

public interface SpecialRoofHouseBuilder extends HouseBuilder {
    HouseBuilder constructRoof(String roofType);
}
