(ns org.nd4j.tools.InfoValues
  "Save value and it's titles for one column.
 Titles strings in array create one title column.
 One main column can have several sub columns.
 Columns are separated with char '|'.
 Collaborate with class InfoLine."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tools InfoValues]))

(defn ->info-values
  "Constructor.

  title-a - `java.lang.String`"
  (^InfoValues [^java.lang.String title-a]
    (new InfoValues title-a)))

(defn title-a
  "Instance Field.

  Title array.

  type: java.lang.String[]"
  ([^InfoValues this]
    (-> this .-titleA)))

(defn vs-l
  "Instance Field.

  Values string list.

  type: java.util.List<java.lang.String>"
  (^java.util.List [^InfoValues this]
    (-> this .-vsL)))

(defn get-values
  "Returns values.
  This method use class InfoLine.
  This method is not intended for external use.

  returns: `java.lang.String`"
  (^java.lang.String [^InfoValues this]
    (-> this (.getValues))))

