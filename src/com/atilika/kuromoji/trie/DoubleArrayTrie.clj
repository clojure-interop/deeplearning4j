(ns com.atilika.kuromoji.trie.DoubleArrayTrie
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.trie DoubleArrayTrie]))

(defn ->double-array-trie
  "Constructor.

  compact-tries - `boolean`"
  (^DoubleArrayTrie [^Boolean compact-tries]
    (new DoubleArrayTrie compact-tries))
  (^DoubleArrayTrie []
    (new DoubleArrayTrie )))

(def *-double-array-trie-filename
  "Static Constant.

  type: java.lang.String"
  DoubleArrayTrie/DOUBLE_ARRAY_TRIE_FILENAME)

(def *-terminating-character
  "Static Constant.

  type: char"
  DoubleArrayTrie/TERMINATING_CHARACTER)

(defn *new-instance
  "resolver - `com.atilika.kuromoji.util.ResourceResolver`

  returns: `com.atilika.kuromoji.trie.DoubleArrayTrie`

  throws: java.io.IOException"
  (^com.atilika.kuromoji.trie.DoubleArrayTrie [^com.atilika.kuromoji.util.ResourceResolver resolver]
    (DoubleArrayTrie/newInstance resolver)))

(defn *read
  "Load Stored data

  input - input stream to read the double array trie from - `java.io.InputStream`

  returns: double array trie, not null - `com.atilika.kuromoji.trie.DoubleArrayTrie`

  throws: java.io.IOException - if an IO error occured during reading the double array trie"
  (^com.atilika.kuromoji.trie.DoubleArrayTrie [^java.io.InputStream input]
    (DoubleArrayTrie/read input)))

(defn write
  "output - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^DoubleArrayTrie this ^java.io.OutputStream output]
    (-> this (.write output))))

(defn build
  "Construct double array trie which is equivalent to input trie

  trie - normal trie, which contains all dictionary words - `com.atilika.kuromoji.trie.Trie`"
  ([^DoubleArrayTrie this ^com.atilika.kuromoji.trie.Trie trie]
    (-> this (.build trie))))

(defn lookup
  "Match input keyword.

  key - key to match - `java.lang.String`

  returns: index value of last character in baseBuffer(double array id) if it is complete match. Negative value if it doesn't match. 0 if it is prefix match. - `int`"
  (^Integer [^DoubleArrayTrie this ^java.lang.String key]
    (-> this (.lookup key)))
  (^Integer [^DoubleArrayTrie this ^java.lang.String key ^Integer index ^Integer j]
    (-> this (.lookup key index j))))

(defn get-base-buffer
  "returns: `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^DoubleArrayTrie this]
    (-> this (.getBaseBuffer))))

(defn get-check-buffer
  "returns: `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^DoubleArrayTrie this]
    (-> this (.getCheckBuffer))))

(defn get-tail-buffer
  "returns: `java.nio.CharBuffer`"
  (^java.nio.CharBuffer [^DoubleArrayTrie this]
    (-> this (.getTailBuffer))))

