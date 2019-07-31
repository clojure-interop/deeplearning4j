(ns org.datavec.api.transform.geo.LocationType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.geo LocationType]))

(def CITY
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/CITY)

(def CITY_ID
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/CITY_ID)

(def CONTINENT
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/CONTINENT)

(def CONTINENT_ID
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/CONTINENT_ID)

(def COUNTRY
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/COUNTRY)

(def COUNTRY_ID
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/COUNTRY_ID)

(def COORDINATES
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/COORDINATES)

(def POSTAL_CODE
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/POSTAL_CODE)

(def SUBDIVISIONS
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/SUBDIVISIONS)

(def SUBDIVISIONS_ID
  "Enum Constant.

  type: org.datavec.api.transform.geo.LocationType"
  LocationType/SUBDIVISIONS_ID)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (LocationType c : LocationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.geo.LocationType[]`"
  ([]
    (LocationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.geo.LocationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.geo.LocationType [^java.lang.String name]
    (LocationType/valueOf name)))

