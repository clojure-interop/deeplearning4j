(ns com.atilika.kuromoji.viterbi.ViterbiSearcher
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi ViterbiSearcher]))

(defn ->viterbi-searcher
  "Constructor.

  mode - `com.atilika.kuromoji.TokenizerBase$Mode`
  costs - `com.atilika.kuromoji.dict.ConnectionCosts`
  unknown-dictionary - `com.atilika.kuromoji.dict.UnknownDictionary`
  penalties - `java.util.List`"
  (^ViterbiSearcher [^com.atilika.kuromoji.TokenizerBase$Mode mode ^com.atilika.kuromoji.dict.ConnectionCosts costs ^com.atilika.kuromoji.dict.UnknownDictionary unknown-dictionary ^java.util.List penalties]
    (new ViterbiSearcher mode costs unknown-dictionary penalties)))

(defn search
  "Find best path from input lattice.

  lattice - the result of build method - `com.atilika.kuromoji.viterbi.ViterbiLattice`

  returns: List of ViterbiNode which consist best path - `java.util.List<com.atilika.kuromoji.viterbi.ViterbiNode>`"
  (^java.util.List [^ViterbiSearcher this ^com.atilika.kuromoji.viterbi.ViterbiLattice lattice]
    (-> this (.search lattice))))

