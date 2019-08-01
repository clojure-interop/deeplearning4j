(ns org.datavec.api.split.NumberedFileInputSplit
  "InputSplit for sequences of numbered files.
 Example usages:
 Suppose files are sequenced according to \"myFile_100.txt\", \"myFile_101.txt\", ..., \"myFile_200.txt\"
 then use new NumberedFileInputSplit(\"myFile_%d.txt\",100,200)
 NumberedFileInputSplit utilizes String.format(), hence the requirement for \"%d\" to represent
 the integer index."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split NumberedFileInputSplit]))

(defn ->numbered-file-input-split
  "Constructor.

  base-string - String that defines file format. Must contain \"%d\", which will be replaced withthe index of the file, possibly zero-padded to x digits if the pattern is in the form %0xd. - `java.lang.String`
  min-idx-inclusive - Minimum index/number (starting number in sequence of files, inclusive) - `int`
  max-idx-inclusive - Maximum index/number (last number in sequence of files, inclusive) - `int`"
  (^NumberedFileInputSplit [^java.lang.String base-string ^Integer min-idx-inclusive ^Integer max-idx-inclusive]
    (new NumberedFileInputSplit base-string min-idx-inclusive max-idx-inclusive)))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^NumberedFileInputSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^NumberedFileInputSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^NumberedFileInputSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^NumberedFileInputSplit this]
    (-> this (.locationsIterator))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^NumberedFileInputSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^NumberedFileInputSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^NumberedFileInputSplit this]
    (-> this (.reset))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^NumberedFileInputSplit this]
    (-> this (.locationsPathIterator))))

(defn locations
  "Description copied from interface: InputSplit

  returns: `java.net.URI[]`"
  ([^NumberedFileInputSplit this]
    (-> this (.locations))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^NumberedFileInputSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^NumberedFileInputSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^NumberedFileInputSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^NumberedFileInputSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn can-write-to-location?
  "Description copied from interface: InputSplit

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^NumberedFileInputSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

