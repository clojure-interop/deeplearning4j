(ns org.datavec.api.split.InputStreamInputSplit
  "Input stream input split.
 The normal pattern is reading the whole
 input stream and turning that in to a record.
 This is meant for streaming raw data
 rather than normal mini batch pre processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split InputStreamInputSplit]))

(defn ->input-stream-input-split
  "Constructor.

  Instantiate with the given
  file as a uri

  is - the input stream to use - `java.io.InputStream`
  path - the path to use - `java.lang.String`"
  (^InputStreamInputSplit [^java.io.InputStream is ^java.lang.String path]
    (new InputStreamInputSplit is path))
  (^InputStreamInputSplit [^java.io.InputStream is]
    (new InputStreamInputSplit is)))

(defn set-is
  "is - `java.io.InputStream`"
  ([^InputStreamInputSplit this ^java.io.InputStream is]
    (-> this (.setIs is))))

(defn get-is
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^InputStreamInputSplit this]
    (-> this (.getIs))))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^InputStreamInputSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^InputStreamInputSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^InputStreamInputSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^InputStreamInputSplit this]
    (-> this (.locationsIterator))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^InputStreamInputSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^InputStreamInputSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^InputStreamInputSplit this]
    (-> this (.reset))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^InputStreamInputSplit this]
    (-> this (.locationsPathIterator))))

(defn locations
  "Description copied from interface: InputSplit

  returns: `java.net.URI[]`"
  ([^InputStreamInputSplit this]
    (-> this (.locations))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^InputStreamInputSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^InputStreamInputSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^InputStreamInputSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^InputStreamInputSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn can-write-to-location?
  "Description copied from interface: InputSplit

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^InputStreamInputSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

