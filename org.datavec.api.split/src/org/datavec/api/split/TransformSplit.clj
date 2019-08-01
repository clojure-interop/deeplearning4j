(ns org.datavec.api.split.TransformSplit
  "InputSplit implementation that maps the URIs of a given BaseInputSplit to new URIs. Useful when features and labels
 are in different files sharing a common naming scheme, and the name of the output file can be determined given the
 name of the input file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split TransformSplit]))

(defn ->transform-split
  "Constructor.

  Apply a given transformation to the raw URI objects

  source-split - the split with URIs to transform - `org.datavec.api.split.BaseInputSplit`
  transform - transform operation that returns a new URI based on an input URI - `org.datavec.api.split.TransformSplit$URITransform`

  throws: java.net.URISyntaxException - thrown if the transformed URI is malformed"
  (^TransformSplit [^org.datavec.api.split.BaseInputSplit source-split ^org.datavec.api.split.TransformSplit$URITransform transform]
    (new TransformSplit source-split transform)))

(defn *of-search-replace
  "Static factory method, replace the string version of the URI with a simple search-replace pair

  source-split - the split with URIs to transform - `org.datavec.api.split.BaseInputSplit`
  search - the string to search - `java.lang.String`
  replace - the string to replace with - `java.lang.String`

  returns: `org.datavec.api.split.TransformSplit`

  throws: java.net.URISyntaxException - thrown if the transformed URI is malformed"
  (^org.datavec.api.split.TransformSplit [^org.datavec.api.split.BaseInputSplit source-split ^java.lang.String search ^java.lang.String replace]
    (TransformSplit/ofSearchReplace source-split search replace)))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^TransformSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^TransformSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^TransformSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^TransformSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^TransformSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^TransformSplit this]
    (-> this (.reset))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^TransformSplit this]
    (-> this (.resetSupported))))

