(ns com.atilika.kuromoji.compile.DoubleArrayTrieCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile DoubleArrayTrieCompiler]))

(defn ->double-array-trie-compiler
  "Constructor."
  (^DoubleArrayTrieCompiler []
    (new DoubleArrayTrieCompiler )))

(defn *build
  "surfaces - `java.util.List`
  compact - `boolean`

  returns: `com.atilika.kuromoji.trie.DoubleArrayTrie`"
  (^com.atilika.kuromoji.trie.DoubleArrayTrie [^java.util.List surfaces ^Boolean compact]
    (DoubleArrayTrieCompiler/build surfaces compact)))

