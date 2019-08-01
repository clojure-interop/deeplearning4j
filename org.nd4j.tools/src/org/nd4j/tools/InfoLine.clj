(ns org.nd4j.tools.InfoLine
  "Save values and titles for one values line.
 Columns are separated with char '|'.
 Collaborate with class InfoValues."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tools InfoLine]))

(defn ->info-line
  "Constructor."
  (^InfoLine []
    (new InfoLine )))

(defn iv-l
  "Instance Field.

  type: java.util.List<org.nd4j.tools.InfoValues>"
  (^java.util.List [^InfoLine this]
    (-> this .-ivL)))

(defn get-title-line
  "Returns titles line as string appointed by title index (0..5).
  Columns are separated with char '|'.
  If title index is < 0 returns \"?\".
  If title index is > 5 returns \"?\".

  mt-lv - - method level - `int`
  title-i - - title index - `int`

  returns: titles line as string - `java.lang.String`"
  (^java.lang.String [^InfoLine this ^Integer mt-lv ^Integer title-i]
    (-> this (.getTitleLine mt-lv title-i))))

(defn get-values-line
  "Returns values line as string.
  Columns are separated with char '|'.

  mt-lv - - method level - `int`

  returns: values line as string - `java.lang.String`"
  (^java.lang.String [^InfoLine this ^Integer mt-lv]
    (-> this (.getValuesLine mt-lv))))

