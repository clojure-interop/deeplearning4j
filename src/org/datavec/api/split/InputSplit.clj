(ns org.datavec.api.split.InputSplit
  "An input split.
 Basically, a list of loadable locations
 exposed as an iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split InputSplit]))

(defn boot-strap-for-write
  "Bootstrap this input split for writing.
  This is for use with RecordWriter"
  ([^InputSplit this]
    (-> this (.bootStrapForWrite))))

(defn open-output-stream-for
  "Open an OutputStream
  for the given location.
  Note that the user is responsible for closing
  the associated output stream.

  location - the location to open the output stream for - `java.lang.String`

  returns: the output input stream - `java.io.OutputStream`

  throws: java.lang.Exception"
  (^java.io.OutputStream [^InputSplit this ^java.lang.String location]
    (-> this (.openOutputStreamFor location))))

(defn update-split-locations
  "Refreshes the split locations
  if needed in memory.
  (Think a few file gets added)

  reset - `boolean`"
  ([^InputSplit this ^Boolean reset]
    (-> this (.updateSplitLocations reset))))

(defn locations-iterator
  "returns: `java.util.Iterator<java.net.URI>`"
  (^java.util.Iterator [^InputSplit this]
    (-> this (.locationsIterator))))

(defn add-new-location
  "Add a new location to this input split
  (this may do anything from updating an in memory location
  to creating a new file)

  location - the location to add - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^InputSplit this ^java.lang.String location]
    (-> this (.addNewLocation location)))
  (^java.lang.String [^InputSplit this]
    (-> this (.addNewLocation))))

(defn reset
  "Reset the InputSplit without reinitializing it from scratch.
  In many cases, this is a no-op.
  For InputSplits that have randomization: reset should shuffle the order."
  ([^InputSplit this]
    (-> this (.reset))))

(defn locations-path-iterator
  "returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^InputSplit this]
    (-> this (.locationsPathIterator))))

(defn locations
  "Locations of the splits

  returns: `java.net.URI[]`"
  ([^InputSplit this]
    (-> this (.locations))))

(defn length
  "Length of the split

  returns: `long`"
  (^Long [^InputSplit this]
    (-> this (.length))))

(defn reset-supported
  "returns: True if the reset() method is supported (or is a no-op), false otherwise. If false is returned, reset()
  may throw an exception - `boolean`"
  (^Boolean [^InputSplit this]
    (-> this (.resetSupported))))

(defn needs-bootstrap-for-write
  "Returns true if this InputSplit
  needs bootstrapping for writing.
  A simple example of needing bootstrapping is for
  FileSplit where there is only a directory
  existing, but no file to write to

  returns: true if this input split needs bootstrapping for
  writing to or not - `boolean`"
  (^Boolean [^InputSplit this]
    (-> this (.needsBootstrapForWrite))))

(defn open-input-stream-for
  "Open an InputStream
  for the given location.
  Note that the user is responsible for closing
  the associated input stream.

  location - the location to open the input stream for - `java.lang.String`

  returns: the opened input stream - `java.io.InputStream`

  throws: java.lang.Exception"
  (^java.io.InputStream [^InputSplit this ^java.lang.String location]
    (-> this (.openInputStreamFor location))))

(defn can-write-to-location?
  "Returns true if the given uri
  can be written to

  location - the location to determine - `java.net.URI`

  returns: `boolean`"
  (^Boolean [^InputSplit this ^java.net.URI location]
    (-> this (.canWriteToLocation location))))

