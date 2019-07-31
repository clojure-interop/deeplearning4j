(ns org.ansj.dic.PathToStream
  "将路径转换为流，如果你需要实现自己的加载器请实现这个类，使用这个类可能需要自己依赖第三方包，比如jdbc连接和nutz"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic PathToStream]))

(defn ->path-to-stream
  "Constructor."
  (^PathToStream []
    (new PathToStream )))

(defn *stream
  "path - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^java.lang.String path]
    (PathToStream/stream path)))

(defn to-stream
  "path - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^PathToStream this ^java.lang.String path]
    (-> this (.toStream path))))

