package org.jellyfin.androidtv.ui.base

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// Walhalla Brand Colors
private val WalhallaDark = Color(0xFF0A0705)
private val WalhallaDarker = Color(0xFF0D0A06)
private val WalhallaGold = Color(0xFFC8922A)
private val WalhallaBright = Color(0xFFF0C060)
private val WalhallaCream = Color(0xFFE8D8B8)
private val WalhallaRed = Color(0xFF8B1A1A)

fun colorScheme(): ColorScheme = ColorScheme(
	background = WalhallaDark,
	onBackground = WalhallaCream,
	button = Color(0xB30D0A06),
	onButton = WalhallaCream,
	buttonFocused = WalhallaGold,
	onButtonFocused = WalhallaDarker,
	buttonDisabled = Color(0x330D0A06),
	onButtonDisabled = Color(0xFF686868),
	buttonActive = Color(0x4DC8922A),
	onButtonActive = WalhallaBright,
	input = Color(0xB30D0A06),
	onInput = WalhallaCream,
	inputFocused = WalhallaGold,
	onInputFocused = WalhallaDarker,
	rangeControlBackground = Color(0xFF3A2A12),
	rangeControlFill = WalhallaGold,
	rangeControlKnob = WalhallaBright,
	seekbarBuffer = Color(0xFF5A4A22),
	recording = WalhallaRed,
	onRecording = WalhallaCream,
	badge = WalhallaGold,
	onBadge = WalhallaDarker,
	listHeader = WalhallaBright,
	listOverline = WalhallaGold,
	listHeadline = WalhallaBright,
	listCaption = WalhallaCream,
	listButton = Color.Transparent,
	listButtonFocused = Color(0xFF2A1F10),
	surface = WalhallaDarker,
	scrim = Color.Black.copy(alpha = 0.67f),
)

@Immutable
data class ColorScheme(
	val background: Color,
	val onBackground: Color,

	val button: Color,
	val onButton: Color,
	val buttonFocused: Color,
	val onButtonFocused: Color,
	val buttonDisabled: Color,
	val onButtonDisabled: Color,
	val buttonActive: Color,
	val onButtonActive: Color,

	val input: Color,
	val onInput: Color,
	val inputFocused: Color,
	val onInputFocused: Color,

	val rangeControlBackground: Color,
	val rangeControlFill: Color,
	val rangeControlKnob: Color,
	val seekbarBuffer: Color,

	val recording: Color,
	val onRecording: Color,

	val badge: Color,
	val onBadge: Color,

	val listHeader: Color,
	val listOverline: Color,
	val listHeadline: Color,
	val listCaption: Color,
	val listButton: Color,
	val listButtonFocused: Color,

	val surface: Color,
	val scrim: Color,
)

val LocalColorScheme = staticCompositionLocalOf { colorScheme() }
