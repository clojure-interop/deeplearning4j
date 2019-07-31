(ns org.ansj.library.company.CompanyAttrLibrary
  "机构名识别词典加载类"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library.company CompanyAttrLibrary]))

(defn *get-company-map
  "returns: `java.util.HashMap<java.lang.String,int[]>`"
  ([]
    (CompanyAttrLibrary/getCompanyMap )))

