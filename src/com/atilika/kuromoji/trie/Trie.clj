(ns com.atilika.kuromoji.trie.Trie
  "Simple Trie used to build the DoubleArrayTrie"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie Trie]))

(defn ->trie
  "Constructor.

  Constructor

  Initialize this as an empty trie"
  (^Trie []
    (new Trie )))

(defn add
  "Adds an input value to this trie

  Before the value is added, a terminating character (U+0001) is appended to the input string

  value - value to add to this trie - `java.lang.String`"
  ([^Trie this ^java.lang.String value]
    (-> this (.add value))))

(defn get-root
  "Returns this trie's root node

  returns: root node, not null - `com.atilika.kuromoji.trie.Trie$Node`"
  (^com.atilika.kuromoji.trie.Trie$Node [^Trie this]
    (-> this (.getRoot))))

