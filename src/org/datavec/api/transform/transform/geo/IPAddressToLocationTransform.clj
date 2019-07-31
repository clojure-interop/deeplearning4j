(ns org.datavec.api.transform.transform.geo.IPAddressToLocationTransform
  "Uses GeoIP2 from from http://www.maxmind.com
 to convert IP addresses to (approximate) locations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.geo IPAddressToLocationTransform]))

(defn ->ip-address-to-location-transform
  "Constructor.

  column-name - `java.lang.String`
  location-type - `org.datavec.api.transform.geo.LocationType`
  delimiter - `java.lang.String`

  throws: java.io.IOException"
  (^IPAddressToLocationTransform [^java.lang.String column-name ^org.datavec.api.transform.geo.LocationType location-type ^java.lang.String delimiter]
    (new IPAddressToLocationTransform column-name location-type delimiter))
  (^IPAddressToLocationTransform [^java.lang.String column-name ^org.datavec.api.transform.geo.LocationType location-type]
    (new IPAddressToLocationTransform column-name location-type))
  (^IPAddressToLocationTransform [^java.lang.String column-name]
    (new IPAddressToLocationTransform column-name)))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  IPAddressToLocationTransform/DEFAULT_DELIMITER)

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^IPAddressToLocationTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^IPAddressToLocationTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IPAddressToLocationTransform this]
    (-> this (.toString))))

