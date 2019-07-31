(ns com.atilika.kuromoji.trie.PatriciaTrieFormatter
  "Utility class to format a PatriciaTrie to dot format for debugging, inspection, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie PatriciaTrieFormatter]))

(defn ->patricia-trie-formatter
  "Constructor.

  Constructor"
  (^PatriciaTrieFormatter []
    (new PatriciaTrieFormatter )))

(defn format
  "Format trie and write to file

  trie - trie to format - `com.atilika.kuromoji.trie.PatriciaTrie`
  file - file to write to - `java.io.File`
  format-bit-string - true if the bits for this key should be included in the node - `boolean`

  throws: java.io.FileNotFoundException - if the file exists but is a directory rather than a regular file,does not exist but cannot be created, or cannot be opened for any other reason"
  ([^PatriciaTrieFormatter this ^com.atilika.kuromoji.trie.PatriciaTrie trie ^java.io.File file ^Boolean format-bit-string]
    (-> this (.format trie file format-bit-string)))
  (^java.lang.String [^PatriciaTrieFormatter this ^com.atilika.kuromoji.trie.PatriciaTrie trie ^Boolean format-bit-string]
    (-> this (.format trie format-bit-string)))
  (^java.lang.String [^PatriciaTrieFormatter this ^com.atilika.kuromoji.trie.PatriciaTrie trie]
    (-> this (.format trie))))

