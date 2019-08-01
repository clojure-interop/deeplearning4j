(ns org.datavec.api.split.BaseInputSplit
  "Base input split"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split BaseInputSplit]))

(defn ->base-input-split
  "Constructor."
  (^BaseInputSplit []
    (new BaseInputSplit )))

(defn can-write-to-location?
  "Description copied from interface: InputSplit

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^BaseInputSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseInputSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^BaseInputSplit this]
    (-> this (.addNewLocation))))

(defn locations
  "Description copied from interface: InputSplit

  returns: `java.net.URI[]`"
  ([^BaseInputSplit this]
    (-> this (.locations))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^BaseInputSplit this]
    (-> this (.locationsIterator))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^BaseInputSplit this]
    (-> this (.locationsPathIterator))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^BaseInputSplit this]
    (-> this (.length))))

(defn sample
  "Samples the locations based on the PathFilter and splits the result into
  an array of InputSplit objects, with sizes proportional to the weights.

  path-filter - to modify the locations in some way (null == as is) - `org.datavec.api.io.filters.PathFilter`
  weights - to split the locations into multiple InputSplit - `double`

  returns: the sampled locations - `org.datavec.api.split.InputSplit[]`"
  ([^BaseInputSplit this ^org.datavec.api.io.filters.PathFilter path-filter ^Double weights]
    (-> this (.sample path-filter weights))))

