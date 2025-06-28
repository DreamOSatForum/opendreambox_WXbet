SUMMARY = "GnuPG archive keys of the opendreambox archive"
HOMEPAGE = "https://dreamboxupdate.com/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83383e728649a34260840c927a13df72"

SRC_URI = "file://opendreambox-pyro.gpg \
           file://LICENSE"

S = "${WORKDIR}"

do_install() {
    if [ "${PACKAGE_FEED_SIGN}" = "1" -a -n "${PACKAGE_FEED_GPG_NAME}" ]; then
        gpg --export "${PACKAGE_FEED_GPG_NAME}" > "${WORKDIR}/${PACKAGE_FEED_GPG_NAME}.gpg"
    fi
    install -d ${D}${sysconfdir}/apt/trusted.gpg.d
    install -m 644 ${WORKDIR}/*.gpg ${D}${sysconfdir}/apt/trusted.gpg.d
}

RDEPENDS_${PN} = "gpgv"
RRECOMMENDS_${PN} = "gnupg"
