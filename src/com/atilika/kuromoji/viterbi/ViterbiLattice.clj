(ns com.atilika.kuromoji.viterbi.ViterbiLattice
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi ViterbiLattice]))

(defn ->viterbi-lattice
  "Constructor.

  dimension - `int`"
  (^ViterbiLattice [^Integer dimension]
    (new ViterbiLattice dimension)))

(defn get-start-index-arr
  "returns: `com.atilika.kuromoji.viterbi.ViterbiNode[][]`"
  ([^ViterbiLattice this]
    (-> this (.getStartIndexArr))))

(defn get-end-index-arr
  "returns: `com.atilika.kuromoji.viterbi.ViterbiNode[][]`"
  ([^ViterbiLattice this]
    (-> this (.getEndIndexArr))))

(defn get-start-size-arr
  "returns: `int[]`"
  ([^ViterbiLattice this]
    (-> this (.getStartSizeArr))))

(defn get-end-size-arr
  "returns: `int[]`"
  ([^ViterbiLattice this]
    (-> this (.getEndSizeArr))))

(defn add-bos
  ""
  ([^ViterbiLattice this]
    (-> this (.addBos))))

(defn add-eos
  ""
  ([^ViterbiLattice this]
    (-> this (.addEos))))

