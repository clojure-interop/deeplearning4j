(ns org.nd4j.linalg.util.HashUtil
  "Stronger 64-bit hash function helper, as described here: http://www.javamex.com/tutorials/collections/strong_hash_code_implementation.shtml"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util HashUtil]))

(defn ->hash-util
  "Constructor."
  (^HashUtil []
    (new HashUtil )))

(defn *get-long-hash
  "This method returns long hash for a given bytes array

  data - `byte[]`

  returns: `long`"
  (^Long [data]
    (HashUtil/getLongHash data)))

