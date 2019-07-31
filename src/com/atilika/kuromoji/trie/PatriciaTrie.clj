(ns com.atilika.kuromoji.trie.PatriciaTrie
  "Convenient and compact structure for storing key-value pairs and quickly
 looking them up, including doing prefix searches

 Implements the Map<String, V> interface

 Note that values(), keySet(), entrySet()
 and containsValue() have naive implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie PatriciaTrie]))

(defn ->patricia-trie
  "Constructor.

  Constructs and empty trie"
  (^PatriciaTrie []
    (new PatriciaTrie )))

(defn contains-key-prefix
  "Test key prefix membership in this trie (prefix search using key)

  prefix - key prefix to search - `java.lang.String`

  returns: true if trie contains key prefix - `boolean`"
  (^Boolean [^PatriciaTrie this ^java.lang.String prefix]
    (-> this (.containsKeyPrefix prefix))))

(defn values
  "Returns a copy of the values contained in this trie as a Set

  returns: values in the trie, not null - `java.util.Collection<V>`"
  (^java.util.Collection [^PatriciaTrie this]
    (-> this (.values))))

(defn put-all
  "Inserts all key and value entries in a map into this trie

  map - map with entries to insert - `java.util.Map`"
  ([^PatriciaTrie this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts value into trie identifiable by key into this trie (key should be non-null)

  key - key to associate with value - `java.lang.String`
  value - value be inserted - `V`

  returns: value inserted - `V`

  throws: java.lang.NullPointerException - in case key is null"
  ([^PatriciaTrie this ^java.lang.String key value]
    (-> this (.put key value))))

(defn entry-set
  "Returns a copy of the mappings contained in this trie as a Set

  returns: entries in the trie, not null - `java.util.Set<java.util.Map.Entry<java.lang.String,V>>`"
  (^java.util.Set [^PatriciaTrie this]
    (-> this (.entrySet))))

(defn contains-value
  "Predicate to test value membership

  value - value to test if is contained in the trie - `java.lang.Object`

  returns: true if and only if trie contains value - `boolean`"
  (^Boolean [^PatriciaTrie this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn get-key-mapper
  "Should only be used by PatriciaTrieFormatter

  returns: key mapper used to map key to bit strings - `com.atilika.kuromoji.trie.PatriciaTrie$KeyMapper<java.lang.String>`"
  (^com.atilika.kuromoji.trie.PatriciaTrie$KeyMapper [^PatriciaTrie this]
    (-> this (.getKeyMapper))))

(defn remove
  "Removes entry identified by key from this trie (currently unsupported)

  key - to remove - `java.lang.Object`

  returns: value removed - `V`

  throws: java.lang.UnsupportedOperationException - is always thrown since this operation is unimplemented"
  ([^PatriciaTrie this ^java.lang.Object key]
    (-> this (.remove key))))

(defn get-root
  "Should only be used by PatriciaTrieFormatter

  returns: trie root, not null - `com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode<V>`"
  (^com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode [^PatriciaTrie this]
    (-> this (.getRoot))))

(defn key-set
  "Returns a copy of the keys contained in this trie as a Set

  returns: keys in the trie, not null - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^PatriciaTrie this]
    (-> this (.keySet))))

(defn empty?
  "Predicate indicating whether this trie is empty

  returns: true if and only ff the trie is empty - `boolean`"
  (^Boolean [^PatriciaTrie this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of key-value mappings in this trie

  returns: number of entries in trie - `int`"
  (^Integer [^PatriciaTrie this]
    (-> this (.size))))

(defn clear
  "Clears this trie by removing all its key-value pairs"
  ([^PatriciaTrie this]
    (-> this (.clear))))

(defn contains-key
  "Test membership in this trie

  key - to test if exists - `java.lang.Object`

  returns: true if trie contains key - `boolean`"
  (^Boolean [^PatriciaTrie this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Get value associated with specified key in this trie

  key - key to retrieve value for - `java.lang.Object`

  returns: value or null if non-existent - `V`"
  ([^PatriciaTrie this ^java.lang.Object key]
    (-> this (.get key))))

