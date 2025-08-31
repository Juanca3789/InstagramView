package com.example.instagramview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cameraButton = findViewById<ImageButton>(R.id.camera)
        val tvButton = findViewById<ImageButton>(R.id.tv)
        val chatButton = findViewById<ImageButton>(R.id.messenger)
        val addHistoryButton = findViewById<ImageButton>(R.id.new_history)
        val history1 = findViewById<ImageButton>(R.id.history_1)
        val history2 = findViewById<ImageButton>(R.id.history_2)
        val viewedHistory = findViewById<ImageButton>(R.id.univewed_history)
        val miniHistory = findViewById<ImageButton>(R.id.mini_history)
        val infoButton = findViewById<ImageButton>(R.id.info)
        val likeButton = findViewById<ImageButton>(R.id.like)
        val commentButton = findViewById<ImageButton>(R.id.comments)
        val shareButton = findViewById<ImageButton>(R.id.share)
        val saveButton = findViewById<ImageButton>(R.id.save)
        val homeButton = findViewById<ImageButton>(R.id.home)
        val searchButton = findViewById<ImageButton>(R.id.search)
        val addButton = findViewById<ImageButton>(R.id.add)
        val videoButton = findViewById<ImageButton>(R.id.video)
        val profileButton = findViewById<ImageButton>(R.id.profile)
        val buttonUrlMap = mapOf(
            cameraButton to "https://img.freepik.com/vector-gratis/marco-fotos-instagram-realista-smartphone_23-2148132743.jpg",
            tvButton to "https://www.youtube.com/",
            chatButton to "https://web.whatsapp.com/",
            addHistoryButton to "https://archive.org/",
            history1 to "https://www.tiktok.com/@saray.bgv/video/7522220696567598392?_r=1&_t=ZS-8y8XOOq3Tve",
            history2 to "https://www.snapchat.com/discover",
            viewedHistory to "https://zoviz.com/es/instagram-story-maker",
            miniHistory to "https://www.wikiwand.com/",
            infoButton to "https://es.wikipedia.org/wiki/Wikipedia:Portada",
            likeButton to "https://www.instagram.com/",
            commentButton to "https://x.com/?lang=es",
            shareButton to "https://www.linkedin.com/home?originalSubdomain=co",
            saveButton to "https://apuestas.wplay.co/es",
            homeButton to "https://es.vecteezy.com/arte-vectorial/7978644-instagram-icons-set-ui-social-media-interface-icon-app-like-comment-follow-live-igtv-shop-notification-vector-ilustracion",
            searchButton to "https://www.google.com/",
            addButton to "https://www.canva.com/es_419/",
            videoButton to "https://www.youtube.com/shorts/AwtpbHSAHP0",
            profileButton to "https://github.com/Juanca3789"
        )
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.loadsImagesAutomatically = true
        webView.settings.useWideViewPort = true
        webView.settings.loadWithOverviewMode = true
        buttonUrlMap.forEach { (button, url) ->
            button.setOnClickListener {
                webView.loadUrl(url)
            }
        }
    }
}