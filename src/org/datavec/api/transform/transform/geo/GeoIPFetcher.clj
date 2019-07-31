(ns org.datavec.api.transform.transform.geo.GeoIPFetcher
  "Downloads and caches the GeoLite2 City database created by MaxMind, available from
 http://www.maxmind.com or uses one already available on system."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.geo GeoIPFetcher]))

(defn ->geo-ip-fetcher
  "Constructor."
  (^GeoIPFetcher []
    (new GeoIPFetcher )))

(def *-geoip-dir
  "Static Constant.

  Default directory for http://dev.maxmind.com/geoip/geoipupdate/

  type: java.lang.String"
  GeoIPFetcher/GEOIP_DIR)

(def *-geoip-dir-2
  "Static Constant.

  type: java.lang.String"
  GeoIPFetcher/GEOIP_DIR2)

(def *-city-db
  "Static Constant.

  type: java.lang.String"
  GeoIPFetcher/CITY_DB)

(def *-city-lite-db
  "Static Constant.

  type: java.lang.String"
  GeoIPFetcher/CITY_LITE_DB)

(def *-city-lite-url
  "Static Constant.

  type: java.lang.String"
  GeoIPFetcher/CITY_LITE_URL)

(defn *fetch-city-db
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File []
    (GeoIPFetcher/fetchCityDB )))

