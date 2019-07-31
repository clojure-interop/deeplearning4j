(ns com.atilika.kuromoji.viterbi.ViterbiBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi ViterbiBuilder]))

(defn ->viterbi-builder
  "Constructor.

  Constructor

  trie - trie with surface forms - `com.atilika.kuromoji.trie.DoubleArrayTrie`
  dictionary - token info dictionary - `com.atilika.kuromoji.dict.TokenInfoDictionary`
  unknown-dictionary - unknown word dictionary - `com.atilika.kuromoji.dict.UnknownDictionary`
  user-dictionary - user dictionary - `com.atilika.kuromoji.dict.UserDictionary`
  mode - tokenization mode - `com.atilika.kuromoji.TokenizerBase$Mode`"
  (^ViterbiBuilder [^com.atilika.kuromoji.trie.DoubleArrayTrie trie ^com.atilika.kuromoji.dict.TokenInfoDictionary dictionary ^com.atilika.kuromoji.dict.UnknownDictionary unknown-dictionary ^com.atilika.kuromoji.dict.UserDictionary user-dictionary ^com.atilika.kuromoji.TokenizerBase$Mode mode]
    (new ViterbiBuilder trie dictionary unknown-dictionary user-dictionary mode)))

(defn build
  "Build lattice from input text

  text - source text for the lattice - `java.lang.String`

  returns: built lattice, not null - `com.atilika.kuromoji.viterbi.ViterbiLattice`"
  (^com.atilika.kuromoji.viterbi.ViterbiLattice [^ViterbiBuilder this ^java.lang.String text]
    (-> this (.build text))))

