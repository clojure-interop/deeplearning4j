(ns com.atilika.kuromoji.io.StringArrayIO
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.io StringArrayIO]))

(defn ->string-array-io
  "Constructor."
  (^StringArrayIO []
    (new StringArrayIO )))

(defn *read-array
  "input - `java.io.InputStream`

  returns: `java.lang.String[]`

  throws: java.io.IOException"
  ([^java.io.InputStream input]
    (StringArrayIO/readArray input)))

(defn *write-array
  "output - `java.io.OutputStream`
  array - `java.lang.String[]`

  throws: java.io.IOException"
  ([^java.io.OutputStream output array]
    (StringArrayIO/writeArray output array)))

(defn *read-array-2-d
  "input - `java.io.InputStream`

  returns: `java.lang.String[][]`

  throws: java.io.IOException"
  ([^java.io.InputStream input]
    (StringArrayIO/readArray2D input)))

(defn *write-array-2-d
  "output - `java.io.OutputStream`
  array - `java.lang.String[][]`

  throws: java.io.IOException"
  ([^java.io.OutputStream output array]
    (StringArrayIO/writeArray2D output array)))

(defn *read-sparse-array-2-d
  "input - `java.io.InputStream`

  returns: `java.lang.String[][]`

  throws: java.io.IOException"
  ([^java.io.InputStream input]
    (StringArrayIO/readSparseArray2D input)))

(defn *write-sparse-array-2-d
  "output - `java.io.OutputStream`
  array - `java.lang.String[][]`

  throws: java.io.IOException"
  ([^java.io.OutputStream output array]
    (StringArrayIO/writeSparseArray2D output array)))

