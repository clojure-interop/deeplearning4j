(ns org.datavec.api.split.StringSplit
  "String split used for single line inputs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split StringSplit]))

(defn ->string-split
  "Constructor.

  data - `java.lang.String`"
  (^StringSplit [^java.lang.String data]
    (new StringSplit data)))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^StringSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^StringSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn get-data
  "returns: `java.lang.String`"
  (^java.lang.String [^StringSplit this]
    (-> this (.getData))))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^StringSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^StringSplit this]
    (-> this (.locationsIterator))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^StringSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^StringSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^StringSplit this]
    (-> this (.reset))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^StringSplit this]
    (-> this (.locationsPathIterator))))

(defn locations
  "Description copied from interface: InputSplit

  returns: `java.net.URI[]`"
  ([^StringSplit this]
    (-> this (.locations))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^StringSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^StringSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^StringSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^StringSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn can-write-to-location?
  "Description copied from interface: InputSplit

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^StringSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

