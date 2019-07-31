(ns com.atilika.kuromoji.viterbi.ViterbiFormatter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi ViterbiFormatter]))

(defn ->viterbi-formatter
  "Constructor.

  costs - `com.atilika.kuromoji.dict.ConnectionCosts`"
  (^ViterbiFormatter [^com.atilika.kuromoji.dict.ConnectionCosts costs]
    (new ViterbiFormatter costs)))

(defn format
  "lattice - `com.atilika.kuromoji.viterbi.ViterbiLattice`
  best-path - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^ViterbiFormatter this ^com.atilika.kuromoji.viterbi.ViterbiLattice lattice ^java.util.List best-path]
    (-> this (.format lattice best-path)))
  (^java.lang.String [^ViterbiFormatter this ^com.atilika.kuromoji.viterbi.ViterbiLattice lattice]
    (-> this (.format lattice))))

