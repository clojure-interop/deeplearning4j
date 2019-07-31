(ns com.atilika.kuromoji.trie.PatriciaTrie$StringKeyMapper
  "A PatriciaTrie.KeyMapper mapping Strings to bits"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie PatriciaTrie$StringKeyMapper]))

(defn ->string-key-mapper
  "Constructor."
  (^PatriciaTrie$StringKeyMapper []
    (new PatriciaTrie$StringKeyMapper )))

(defn set?
  "Description copied from interface: PatriciaTrie.KeyMapper

  bit - bit to test - `int`
  key - key to use as a base for testing - `java.lang.String`

  returns: true if the specified bit is set in the provided key - `boolean`"
  (^Boolean [^PatriciaTrie$StringKeyMapper this ^Integer bit ^java.lang.String key]
    (-> this (.isSet bit key))))

(defn to-bit-string
  "Description copied from interface: PatriciaTrie.KeyMapper

  key - key to format to a String - `java.lang.String`

  returns: key formatted as a String, not null - `java.lang.String`"
  (^java.lang.String [^PatriciaTrie$StringKeyMapper this ^java.lang.String key]
    (-> this (.toBitString key))))

