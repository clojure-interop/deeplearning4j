(ns org.datavec.api.split.ListStringSplit
  "An input split that already
 has delimited data of some kind."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split ListStringSplit]))

(defn ->list-string-split
  "Constructor.

  data - `java.util.List`"
  (^ListStringSplit [^java.util.List data]
    (new ListStringSplit data)))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^ListStringSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^ListStringSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn get-data
  "returns: `java.util.List<java.util.List<java.lang.String>>`"
  (^java.util.List [^ListStringSplit this]
    (-> this (.getData))))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^ListStringSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^ListStringSplit this]
    (-> this (.locationsIterator))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ListStringSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^ListStringSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^ListStringSplit this]
    (-> this (.reset))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^ListStringSplit this]
    (-> this (.locationsPathIterator))))

(defn locations
  "Locations of the splits

  returns: `java.net.URI[]`"
  ([^ListStringSplit this]
    (-> this (.locations))))

(defn length
  "Length of the split

  returns: `long`"
  (^Long [^ListStringSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^ListStringSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^ListStringSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^ListStringSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn can-write-to-location?
  "Description copied from interface: InputSplit

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^ListStringSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

