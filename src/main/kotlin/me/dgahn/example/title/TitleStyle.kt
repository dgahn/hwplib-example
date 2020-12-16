package me.dgahn.example.title

import kr.dogfoot.hwplib.`object`.bodytext.control.gso.textbox.TextVerticalAlignment
import kr.dogfoot.hwplib.`object`.docinfo.numbering.ParagraphAlignment
import kr.dogfoot.hwplib.`object`.docinfo.parashape.Alignment
import me.dgahn.hwpdsl.BorderFillStyle
import me.dgahn.hwpdsl.CtrlHeaderStyle
import me.dgahn.hwpdsl.ListHeaderStyle
import me.dgahn.hwpdsl.ParagraphStyle
import me.dgahn.hwpdsl.PatternFillStyle
import me.dgahn.hwpdsl.TableRecordStyle
import me.dgahn.hwpdsl.TableStyle
import me.dgahn.hwpdsl.TdStyle

private const val titleNameWidth = 130.0
private const val timeWidth = 70.0
private const val tableWidth = titleNameWidth + timeWidth
private const val backColorValue: Long = 0x005c4719
private const val charColorValue: Long = 0x00FFFFFF
private const val tdHeight: Double = 15.0
private const val tableHeight: Double = tdHeight * 2
private const val titleFontSize: Double = 30.0
private const val margin: Double = 12.0

internal val titleNameTableStyle = TableStyle(
    ctrlHeaderStyle = CtrlHeaderStyle(
        width = tableWidth,
        height = tableHeight
    ),
    tableRecordStyle = TableRecordStyle()
)

internal val titleNameTdStyle = TdStyle(
    borderFileStyle = BorderFillStyle(),
    patternFillStyle = PatternFillStyle(
        backColorValue = backColorValue
    ),
    listHeaderStyle = ListHeaderStyle(
        width = titleNameWidth,
        height = tdHeight,
    ),
    paragraphStyle = ParagraphStyle(
        paragraphAlignment = Alignment.Left,
        charColorValue = charColorValue,
        baseSize = titleFontSize,
        isBold = true,
        leftMargin = margin
    )
)

internal val firstTimeTdStyle = TdStyle(
    borderFileStyle = BorderFillStyle(),
    patternFillStyle = PatternFillStyle(
        backColorValue = backColorValue
    ),
    listHeaderStyle = ListHeaderStyle(
        width = timeWidth,
        height = tdHeight,
        textVerticalAlignment = TextVerticalAlignment.Bottom
    ),
    paragraphStyle = ParagraphStyle(
        charColorValue = charColorValue,
        paragraphAlignment = Alignment.Right,
        rightMargin = margin
    )
)

internal val secondTimeTdStyle = TdStyle(
    borderFileStyle = BorderFillStyle(),
    patternFillStyle = PatternFillStyle(
        backColorValue = backColorValue
    ),
    listHeaderStyle = ListHeaderStyle(
        width = timeWidth,
        height = tdHeight,
        textVerticalAlignment = TextVerticalAlignment.Top
    ),
    paragraphStyle = ParagraphStyle(
        charColorValue = charColorValue,
        paragraphAlignment = Alignment.Right,
        rightMargin = margin
    )
)