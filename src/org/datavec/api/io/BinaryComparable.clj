(ns org.datavec.api.io.BinaryComparable
  "Interface supported by WritableComparable
 types supporting ordering/permutation by a representative set of bytes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io BinaryComparable]))

(defn ->binary-comparable
  "Constructor."
  (^BinaryComparable []
    (new BinaryComparable )))

(defn get-length
  "Return n st bytes 0..n-1 from {#getBytes()} are valid.

  returns: `int`"
  (^Integer [^BinaryComparable this]
    (-> this (.getLength))))

(defn get-bytes
  "Return representative byte array for this instance.

  returns: `byte[]`"
  ([^BinaryComparable this]
    (-> this (.getBytes))))

(defn compare-to
  "Compare bytes from {#getBytes()} to those provided.

  other - `byte[]`
  off - `int`
  len - `int`

  returns: `int`"
  (^Integer [^BinaryComparable this other ^Integer off ^Integer len]
    (-> this (.compareTo other off len)))
  (^Integer [^BinaryComparable this ^org.datavec.api.io.BinaryComparable other]
    (-> this (.compareTo other))))

(defn equals
  "Return true if bytes from {#getBytes()} match.

  other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BinaryComparable this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "Return a hash of the bytes returned from {#getBytes()}.

  returns: `int`"
  (^Integer [^BinaryComparable this]
    (-> this (.hashCode))))

