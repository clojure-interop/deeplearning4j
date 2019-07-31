(ns org.deeplearning4j.datasets.mnist.MnistDbFile
  "MNIST database file containing entries that can represent image or label
 data. Extends the standard random access file with methods for navigating
 over the entries. The file format is basically idx with specific header
 information. This includes a magic number for determining the type of stored
 entries, count of entries."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.mnist MnistDbFile]))

(defn ->mnist-db-file
  "Constructor.

  Creates new instance and reads the header information.

  name - the system-dependent filename - `java.lang.String`
  mode - the access mode - `java.lang.String`

  throws: java.io.IOException"
  (^MnistDbFile [^java.lang.String name ^java.lang.String mode]
    (new MnistDbFile name mode)))

(defn get-current-index
  "The current entry index.

  returns: long - `long`

  throws: java.io.IOException"
  (^Long [^MnistDbFile this]
    (-> this (.getCurrentIndex))))

(defn set-current-index
  "Set the required current entry index.

  curr - the entry index - `long`"
  ([^MnistDbFile this ^Long curr]
    (-> this (.setCurrentIndex curr))))

(defn get-header-size
  "returns: `int`"
  (^Integer [^MnistDbFile this]
    (-> this (.getHeaderSize))))

(defn get-entry-length
  "Number of bytes for each entry.
  Defaults to 1.

  returns: int - `int`"
  (^Integer [^MnistDbFile this]
    (-> this (.getEntryLength))))

(defn next
  "Move to the next entry.

  throws: java.io.IOException"
  ([^MnistDbFile this]
    (-> this (.next))))

(defn prev
  "Move to the previous entry.

  throws: java.io.IOException"
  ([^MnistDbFile this]
    (-> this (.prev))))

(defn get-count
  "returns: `int`"
  (^Integer [^MnistDbFile this]
    (-> this (.getCount))))

