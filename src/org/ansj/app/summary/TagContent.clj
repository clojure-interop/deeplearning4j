(ns org.ansj.app.summary.TagContent
  "关键字标红，"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.summary TagContent]))

(defn ->tag-content
  "Constructor.

  begin-tag - `java.lang.String`
  end-tag - `java.lang.String`"
  (^TagContent [^java.lang.String begin-tag ^java.lang.String end-tag]
    (new TagContent begin-tag end-tag)))

(defn tag-content
  "key-words - `java.util.List`
  content - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^TagContent this ^java.util.List key-words ^java.lang.String content]
    (-> this (.tagContent key-words content)))
  (^java.lang.String [^TagContent this ^org.ansj.app.summary.pojo.Summary summary]
    (-> this (.tagContent summary))))

