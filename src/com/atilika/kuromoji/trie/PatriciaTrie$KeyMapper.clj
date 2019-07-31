(ns com.atilika.kuromoji.trie.PatriciaTrie$KeyMapper
  "Generic interface to map a key to bits"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie PatriciaTrie$KeyMapper]))

(defn set?
  "Tests a bit in a key

  bit - bit to test - `int`
  key - key to use as a base for testing - `K`

  returns: true if the specified bit is set in the provided key - `boolean`"
  (^Boolean [^PatriciaTrie$KeyMapper this ^Integer bit key]
    (-> this (.isSet bit key))))

(defn to-bit-string
  "Formats a key as a String

  key - key to format to a String - `K`

  returns: key formatted as a String, not null - `java.lang.String`"
  (^java.lang.String [^PatriciaTrie$KeyMapper this key]
    (-> this (.toBitString key))))

