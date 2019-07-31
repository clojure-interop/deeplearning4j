(ns org.nd4j.parameterserver.distributed.logic.storage.WordVectorStorage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.storage WordVectorStorage]))

(defn ->word-vector-storage
  "Constructor."
  (^WordVectorStorage []
    (new WordVectorStorage )))

(def *-syn-0
  "Static Constant.

  type: java.lang.Integer"
  WordVectorStorage/SYN_0)

(def *-syn-1
  "Static Constant.

  type: java.lang.Integer"
  WordVectorStorage/SYN_1)

(def *-syn-1-negative
  "Static Constant.

  type: java.lang.Integer"
  WordVectorStorage/SYN_1_NEGATIVE)

(def *-exp-table
  "Static Constant.

  type: java.lang.Integer"
  WordVectorStorage/EXP_TABLE)

(def *-negative-table
  "Static Constant.

  type: java.lang.Integer"
  WordVectorStorage/NEGATIVE_TABLE)

