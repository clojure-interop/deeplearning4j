(ns org.datavec.api.split.OutputStreamInputSplit
  "Input stream input split.
 The normal pattern outputStream reading the whole
 input stream and turning that in to a record.
 This outputStream meant for streaming raw data
 rather than normal mini batch pre processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split OutputStreamInputSplit]))

(defn ->output-stream-input-split
  "Constructor.

  output-stream - `java.io.OutputStream`"
  (^OutputStreamInputSplit [^java.io.OutputStream output-stream]
    (new OutputStreamInputSplit output-stream)))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^OutputStreamInputSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^OutputStreamInputSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^OutputStreamInputSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^OutputStreamInputSplit this]
    (-> this (.locationsIterator))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^OutputStreamInputSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^OutputStreamInputSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^OutputStreamInputSplit this]
    (-> this (.reset))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^OutputStreamInputSplit this]
    (-> this (.locationsPathIterator))))

(defn locations
  "Description copied from interface: InputSplit

  returns: `java.net.URI[]`"
  ([^OutputStreamInputSplit this]
    (-> this (.locations))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^OutputStreamInputSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^OutputStreamInputSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^OutputStreamInputSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^OutputStreamInputSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn can-write-to-location?
  "Description copied from interface: InputSplit

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^OutputStreamInputSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

