(ns org.datavec.api.split.FileSplit
  "File input split. Splits up a root directory in to files."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split FileSplit]))

(defn ->file-split
  "Constructor.

  root-dir - `java.io.File`
  allow-format - `java.lang.String[]`
  rng - `java.util.Random`"
  (^FileSplit [^java.io.File root-dir allow-format ^java.util.Random rng]
    (new FileSplit root-dir allow-format rng))
  (^FileSplit [^java.io.File root-dir ^java.util.Random rng]
    (new FileSplit root-dir rng))
  (^FileSplit [^java.io.File root-dir]
    (new FileSplit root-dir)))

(defn boot-strap-for-write
  "Description copied from interface: InputSplit"
  ([^FileSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^FileSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn update-split-locations
  "Description copied from interface: InputSplit

  reset - `boolean`"
  ([^FileSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn add-new-location
  "Description copied from interface: InputSplit

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FileSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^FileSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Description copied from interface: InputSplit"
  ([^FileSplit this]
    (-> this (.reset))))

(defn get-root-dir
  "returns: `java.io.File`"
  (^java.io.File [^FileSplit this]
    (-> this (.getRootDir))))

(defn length
  "Description copied from interface: InputSplit

  returns: `long`"
  (^Long [^FileSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^FileSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Description copied from interface: InputSplit

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^FileSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Description copied from interface: InputSplit

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^FileSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

