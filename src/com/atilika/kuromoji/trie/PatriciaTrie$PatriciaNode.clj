(ns com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode
  "Nodes used in a PatriciaTrie containing a String key and associated value data"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie PatriciaTrie$PatriciaNode]))

(defn ->patricia-node
  "Constructor.

  Constructs a new node

  key - this node's key - `java.lang.String`
  value - this node's value - `V`
  bit - this node's critical bit - `int`"
  (^PatriciaTrie$PatriciaNode [^java.lang.String key value ^Integer bit]
    (new PatriciaTrie$PatriciaNode key value bit)))

(defn get-left
  "Returns this node's left node

  returns: left node - `com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode<V>`"
  (^com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode [^PatriciaTrie$PatriciaNode this]
    (-> this (.getLeft))))

(defn set-left
  "Set this node's left node

  left - left node - `com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode`"
  ([^PatriciaTrie$PatriciaNode this ^com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode left]
    (-> this (.setLeft left))))

(defn get-key
  "Get this node's key

  returns: key, not null - `java.lang.String`"
  (^java.lang.String [^PatriciaTrie$PatriciaNode this]
    (-> this (.getKey))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PatriciaTrie$PatriciaNode this]
    (-> this (.toString))))

(defn get-value
  "Returns this node's value

  returns: payload value - `V`"
  ([^PatriciaTrie$PatriciaNode this]
    (-> this (.getValue))))

(defn get-right
  "Returns this node's right node

  returns: right node - `com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode<V>`"
  (^com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode [^PatriciaTrie$PatriciaNode this]
    (-> this (.getRight))))

(defn set-value
  "Sets this node's value

  value - value to set - `V`"
  ([^PatriciaTrie$PatriciaNode this value]
    (-> this (.setValue value))))

(defn set-right
  "Set this node's right node

  right - right node - `com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode`"
  ([^PatriciaTrie$PatriciaNode this ^com.atilika.kuromoji.trie.PatriciaTrie$PatriciaNode right]
    (-> this (.setRight right))))

(defn get-bit
  "Returns this node's critical bit index

  returns: critical bit index (from left/MSB) - `int`"
  (^Integer [^PatriciaTrie$PatriciaNode this]
    (-> this (.getBit))))

