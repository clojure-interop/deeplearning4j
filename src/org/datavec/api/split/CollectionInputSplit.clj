(ns org.datavec.api.split.CollectionInputSplit
  "A simple InputSplit based on a collection of URIs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split CollectionInputSplit]))

(defn ->collection-input-split
  "Constructor.

  array - `java.net.URI[]`"
  (^CollectionInputSplit [array]
    (new CollectionInputSplit array)))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^CollectionInputSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^CollectionInputSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^CollectionInputSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^CollectionInputSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^CollectionInputSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^CollectionInputSplit this]
    (-> this (.length))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^CollectionInputSplit this]
    (-> this (.reset))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^CollectionInputSplit this]
    (-> this (.resetSupported))))

