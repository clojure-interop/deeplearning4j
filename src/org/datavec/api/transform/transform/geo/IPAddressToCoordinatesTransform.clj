(ns org.datavec.api.transform.transform.geo.IPAddressToCoordinatesTransform
  "Uses GeoIP2 from from http://www.maxmind.com
 to convert IP addresses to (approximate) coordinates (latitude:longitude).
 For example, \"128.101.101.101\" becomes something like \"44.9733:-93.2323\"."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.geo IPAddressToCoordinatesTransform]))

(defn ->ip-address-to-coordinates-transform
  "Constructor.

  column-name - `java.lang.String`
  delimiter - `java.lang.String`

  throws: java.io.IOException"
  (^IPAddressToCoordinatesTransform [^java.lang.String column-name ^java.lang.String delimiter]
    (new IPAddressToCoordinatesTransform column-name delimiter))
  (^IPAddressToCoordinatesTransform [^java.lang.String column-name]
    (new IPAddressToCoordinatesTransform column-name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IPAddressToCoordinatesTransform this]
    (-> this (.toString))))

