(ns org.ansj.util.AnsjReader
  "我又剽窃了下jdk...职业嫖客 为了效率这个流的操作是不支持多线程的,要么就是长时间不写这种东西了。发现好费劲啊 这个reader的特点。。只会输入
 句子不会输出\\r\\n .会有一个start来记录当前返回字符串。起始偏移量"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util AnsjReader]))

(defn ->ansj-reader
  "Constructor.

  Creates a buffering character-input stream that uses an input buffer of
  the specified size.

  in - A Reader - `java.io.Reader`
  sz - Input-buffer size - `int`

  throws: java.lang.IllegalArgumentException - If sz <= 0"
  (^AnsjReader [^java.io.Reader in ^Integer sz]
    (new AnsjReader in sz))
  (^AnsjReader [^java.io.Reader in]
    (new AnsjReader in)))

(defn read
  "为了功能的单一性我还是不实现了

  cbuf - `char[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^AnsjReader this cbuf ^Integer off ^Integer len]
    (-> this (.read cbuf off len))))

(defn read-line
  "读取一行数据。ps 读取结果会忽略 \\n \\r

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^AnsjReader this]
    (-> this (.readLine))))

(defn close
  "throws: java.io.IOException"
  ([^AnsjReader this]
    (-> this (.close))))

(defn get-start
  "returns: `int`"
  (^Integer [^AnsjReader this]
    (-> this (.getStart))))

