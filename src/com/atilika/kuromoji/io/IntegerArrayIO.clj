(ns com.atilika.kuromoji.io.IntegerArrayIO
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.io IntegerArrayIO]))

(defn ->integer-array-io
  "Constructor."
  (^IntegerArrayIO []
    (new IntegerArrayIO )))

(defn *read-array
  "input - `java.io.InputStream`

  returns: `int[]`

  throws: java.io.IOException"
  ([^java.io.InputStream input]
    (IntegerArrayIO/readArray input)))

(defn *write-array
  "output - `java.io.OutputStream`
  array - `int[]`

  throws: java.io.IOException"
  ([^java.io.OutputStream output array]
    (IntegerArrayIO/writeArray output array)))

(defn *read-array-2-d
  "input - `java.io.InputStream`

  returns: `int[][]`

  throws: java.io.IOException"
  ([^java.io.InputStream input]
    (IntegerArrayIO/readArray2D input)))

(defn *write-array-2-d
  "output - `java.io.OutputStream`
  array - `int[][]`

  throws: java.io.IOException"
  ([^java.io.OutputStream output array]
    (IntegerArrayIO/writeArray2D output array)))

(defn *read-sparse-array-2-d
  "input - `java.io.InputStream`

  returns: `int[][]`

  throws: java.io.IOException"
  ([^java.io.InputStream input]
    (IntegerArrayIO/readSparseArray2D input)))

(defn *write-sparse-array-2-d
  "output - `java.io.OutputStream`
  array - `int[][]`

  throws: java.io.IOException"
  ([^java.io.OutputStream output array]
    (IntegerArrayIO/writeSparseArray2D output array)))

